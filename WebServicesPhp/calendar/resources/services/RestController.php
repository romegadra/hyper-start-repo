<?php
require_once("CalendarRestHandler.php");
		
$view = "";
$calendarRestHandler = new CalendarRestHandler();
if(isset($_GET["view"]))
	$view = $_GET["view"];
/*
controls the RESTful services
URL mapping
*/
switch($view){
	case "allSchedules":
		$calendarRestHandler->getAllSchedules();
		break;
		
	case "getSchedulesByLabId" :
		$calendarRestHandler->getSchedulesByLabId1($_GET["id"]);	
		break;
	case "insertComments":
		$calendarRestHandler->insertComments();
		break;
		
	case "" :
		//404 not found.
		break;	

}
?>
