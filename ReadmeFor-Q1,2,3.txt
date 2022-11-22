Name: Abdelrahman Taha Hussein Ali 
Email: abdelrahmaan97@gmail.com
Mobile No: +201115429444


Question 1 :

	1.
	Feature: Anonymous User Can only download 3 books
	
		Scenario  :
			Given Anonymous user login the Application.
			When trying to download the 4th book "more than 3 books".
			then Deny the download request from the Anonymous user.
			then Error Message to the Anonymous user with the regulations of the Application.
	2.
	Feature: Testing Performance while low battery
		Scenario : 
			Given Low power Mode is active.
			When launch Application while on low power mode.
			then Application opens with no errors in the range of pre-set boot-up time.
			when Application boot-up time exceeds the max pre-set time.
			then Error message with a re-boot of the application.
	3.
	Feature: Testing the sorting of the latest 10 books
		Scenario :
			Given Application displays latest 10 books.
			when books upload Time "SS:MM:HH , DD/MM/YYY" are in descending order.
			then books are displayed & sorted correctly .
		

Question 2 :

	The Error in the code is the While loop condition.
	it will be infinite loop as the 'n' value will never reach more than 10.


Question 3 :

	1.write a sql query to return (Student name, Book name and Renting date) to show the history of books renting by the students
	
		Answer:
			select t1.std_name , t3.rent_date, t2.book_name from table1 t1 
			join table3 t3 on t1.student_id = t3.student_id 
			join table2 t2 on t2.book_id= t3.book_id ;


	2.write a sql query to return (Student name, number of rented books) to list the students who rent more than one book

		Answer:
			select std_name, COUNT(t3.book_id)   from table1 t1 join table3 t3 on t1.student_id = t3.student_id 
			GROUP by std_name having COUNT(t3.book_id) > 1 ;


Question 4:

	Answer: Project File Attached