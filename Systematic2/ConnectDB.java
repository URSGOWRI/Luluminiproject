package com.lulu.database.Systematic2;
import java.sql.Connection;
import java.sql.DriverManager;
public class ConnectDB  {

	 

	static Connection connection;

 

	//Write the Logic for connections to be ready and Available

 

	//user name ,Password ,url for 3rd party tool

 

	static Connection setupConnection() {

 

	try {

 

		 Class.forName("com.mysql.cj.jdbc.Driver");//drive support sets up

 

		

 

         connection = DriverManager.getConnection("mypath",

 

            "root", "");

 

	}

 

	catch(Exception E) {	

 

	}

 

	return connection;

 

  }

 

}

