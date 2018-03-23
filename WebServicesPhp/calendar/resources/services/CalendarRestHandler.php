<?php
require_once("SimpleRest.php");
		
class CalendarRestHandler extends SimpleRest {

	public $data = "";
		const DB_SERVER = "";
		const DB_USER = "";
		const DB_PASSWORD = "";
		const DB = "";

		private $conn = NULL;

		public function __construct(){ 
			//parent::__construct();				// Init parent contructor
			//$this->dbConnect();					// Initiate Database connection
		}
		
		/*
		 *  Connect to Database
		*/
	private function dbConnect(){ //"localhost","root","","Ladle"

	}
	
	function getAllSchedules() {
		$conn = new mysqli(self::DB_SERVER, self::DB_USER, self::DB_PASSWORD, self::DB);
		mysqli_set_charset($conn, "utf8");
		$query = "SELECT * from horarios h order by horaInicio ASC";
		
		$r = $conn->query($query) or die($conn->error.__LINE__);
		$row_count = mysqli_num_rows($r);
		if($row_count > 0) {
			$result = array();
			while($row = $r->fetch_assoc()) {
				$result[] = $row;
			}
			$r->close();
		}
		
		$data = $result;
		if(empty($result)) {
			$statusCode = 404;
			$result = array('error' => 'No schedules found!');		
		} else {
			$statusCode = 200;
		}

		$requestContentType = $_SERVER['HTTP_ACCEPT'];
		$this ->setHttpHeaders($requestContentType, $statusCode);
		$response = $this->encodeJson($data);
		echo $response;
	}
	public function getSchedulesByLabId1($labId) {
		$conn = new mysqli(self::DB_SERVER, self::DB_USER, self::DB_PASSWORD, self::DB);
		mysqli_set_charset($conn, "utf8");	
		$query = "SELECT * FROM horarios where lab = '$labId' order by horaInicio ASC";

		$r  = $conn->query($query) or die($conn->error.__LINE__);
		$row_count = mysqli_num_rows($r);

		if($row_count > 0) {
			$result = array();
			while($row = $r->fetch_assoc()) {
				$result[] = $row;
			}
			$r->close();
		}

		if(empty($result)) {
			$statusCode = 404;
			$result = array('error' => 'No schedules found for this lab id!');		
		} else {
			$statusCode = 200;
		}

		$requestContentType = $_SERVER['HTTP_ACCEPT'];
		$this ->setHttpHeaders($requestContentType, $statusCode);
		$response = $this->encodeJson($result);
		echo $response;
	}
	
	public function encodeHtml($responseData) {
	
		$htmlResponse = "<table border='1'>";
		foreach($responseData as $key=>$value) {
    			$htmlResponse .= "<tr><td>". $key. "</td><td>". $value. "</td></tr>";
		}
		$htmlResponse .= "</table>";
		return $htmlResponse;		
	}
	
	public function encodeJson($responseData) {
		$jsonResponse = json_encode($responseData);
		return $jsonResponse;		
	}
	
	public function encodeXml($responseData) {
		// creating object of SimpleXMLElement
		$xml = new SimpleXMLElement('<?xml version="1.0"?><mobile></mobile>');
		foreach($responseData as $key=>$value) {
			$xml->addChild($key, $value);
		}
		return $xml->asXML();
	}
}
?>