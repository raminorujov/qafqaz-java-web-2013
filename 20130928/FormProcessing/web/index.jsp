<%-- 
    Document   : index
    Created on : Sep 28, 2013, 9:37:00 AM
    Author     : raminorujov
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registration Form</title>
    </head>
    <body>
        <h1>Please, fill the form</h1>
        
        <form action="register" method="post">
            Name: <input type="text" name="name"/> <br/>
            Surname: <input type="text" name="surname"> <br/>
            Marital status: 
            <input type="radio" name="maritalStatus" value="0">Single</input> &nbsp;
            <input type="radio" name="maritalStatus" value="1">Married</input> <br/>
            
            Foreign language skills: <br/>
            <input type="checkbox" name="foreignLanguages" value="1">English</input> <br/>
            <input type="checkbox" name="foreignLanguages" value="2">Turkish</input> <br/>
            <input type="checkbox" name="foreignLanguages" value="3">Russian</input> <br/>
            <input type="checkbox" name="foreignLanguages" value="4">French</input> <br/>
            <input type="checkbox" name="foreignLanguages" value="5">Arabic</input> <br/>
            <input type="checkbox" name="foreignLanguages" value="6">Spanish</input> <br/>
            <input type="checkbox" name="foreignLanguages" value="7">Korean</input> <br/>
            <input type="checkbox" name="foreignLanguages" value="8">Chinese</input> <br/>
            <input type="checkbox" name="foreignLanguages" value="9">German</input> <br/>
            <input type="checkbox" name="foreignLanguages" value="10">Italian</input> <br/>
            
            Country: <select name="country">
                <option value="0">Select country</option>
                <option value="1">Azerbaijan</option>
                <option value="2">Russian</option>
                <option value="3">Turkey</option>
                <option value="4">Georgia</option>
                <option value="5">Spain</option>
                <option value="6">Germany</option>
                <option value="7">UK</option>
                <option value="8">Italy</option>
                <option value="9">France</option>
                <option value="10">Brasilia</option>
                <option value="11">Korea</option>
                <option value="12">China</option>
                <option value="13">UAE</option>
            </select> <br/>
            
            Visited countries: <select name="visitedCountries" multiple="1" size="10">
                <option value="1">Azerbaijan</option>
                <option value="2">Russian</option>
                <option value="3">Turkey</option>
                <option value="4">Georgia</option>
                <option value="5">Spain</option>
                <option value="6">Germany</option>
                <option value="7">UK</option>
                <option value="8">Italy</option>
                <option value="9">France</option>
                <option value="10">Brasilia</option>
                <option value="11">Korea</option>
                <option value="12">China</option>
                <option value="13">UAE</option>
            </select> <br/>
            
            About: <textarea name="about" rows="3" cols="50">
                Write about yourself
            </textarea> <br/>                       
            
            <input type="submit" name="register" value="Register"/> &nbsp;
            <input type="reset" name="clear" value="Clear"/>
         </form>
    </body>
</html>
