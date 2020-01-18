<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Room Booking</title>
<style>
div {
  background:green;
  position:absolute;
  color:#fff;
  top:50%;
  left:50%;
  padding:15px;
  -ms-transform: translateX(-50%) translateY(-50%);
  -webkit-transform: translate(-50%,-50%);
  transform: translate(-50%,-50%);
}  

</style>
</head>
<body>
	<div>
	<label style:color>please enter details </label>
		<form action="registerUser"  method = "GET">
	
	<table>

    <tr>
			<td>First Name :</td>
   			<td><input type="text" name="fname" /></td>
   </tr>


	<tr>
		 <td>Last Name :</td>
		<td><input type="text" name="lname"/></td>
	</tr>

	<tr>
		 <td>Room Type </td>
		<td> <input type="radio" name="roomType" value="STANDARD"> Standard 
		 <input type="radio" name="roomType" value="DELUXE">  Deluxe</td>
	</tr>

	<tr>
		 <td>Check-In Date</td>
		<td><input type="date" name="checkInDate"></td>
	</tr>
 
	<tr>
		 <td>Check-Out Date</td>
		<td><input type="date" name="checkOutDate" ></td>
	</tr>
	<tr>
		 <td>Email Address</td>
		<td><input type="email" name="email"></td>
	</tr>
	<tr>
		 <td>Birthday:</td>
		<td> <input type="datetime-local" name="bday"></td>
	</tr>
	<tr>
		 <td>Upload Bulk Registration</td>
		<td> <input type="file" name="myFile"></td>
	</tr>

	<tr>
		 <td>Signature</td>
		<td> <input type="image" src="img_submit.gif" alt="Submit"  name="signature"></td>
	</tr>

	<tr>
		 <td>Select a file:</td>
		<td> <input type="datetime-local" name="bdaytime"></td>
	</tr>

	<tr>
		 <td>Select a file:</td>
		<td>	<input type="radio" name="gender" value="MALE"> Male<br>
<input type="radio" name="gender" value="FEMALE"> Female<br>
<input type="radio" name="gender" value="OTHER"> Other

</td>
</tr>


	<tr>
		 <td>Feedback:</td>
		<td> <input type="range" name="points" min="0" max="10"></td>
	</tr>
	
	<tr>
		 <td>Reset:</td>
		<td> <input type="reset"></td>
	</tr>
	
	<tr>
		 <td>Mobile:</td>
		<td> <input type="tel" name="mobile"></td>
	</tr>
		
	
	<tr>
		 <td> Add your homepage: </td>
		<td> <input type="url" name="homepage"></td>
	</tr>
	
	<tr>
		<input type="submit" value="submit" name="submit"/>
	</tr>
</table>
	</form>
	</div>
	


</body>
</html>