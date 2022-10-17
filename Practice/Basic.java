//basics


cricketer				//parent class
{
	string name;
	string country;
	
	printName();
	printCountry();
	
}

Batsman					//child class of cricketer
{
	totalRuns;
	printTotalRuns();
}

Bowler					//child class of cricketer
{
	totalWickets;
	printTotalWickets();
	
}

===================================================================

Car
{
	engine;
	seatingCapacity;
	typeOfCar;
	colour;
}
CheapCars
{
	
}
ExpensiveCars
{
	
}

=====================================================================

Employees
{
	empName;
	empId;
	department;
	designation;
	joiningDate;
	gender;
	contactNo;
	accountNo;
	commonrules;
	empAddress;
	qualifications;
	emailId;
	
	printSalary();
	printPersonalDetails();
}
RegularEmployee
{
	retirementDate;
	payScale;
	rulesForRegularEmp;
	
	printRetirementDate();
	printPayScale();
}
ContractEmployee
{
	remainingYearsOfService;
	consolidatedSalary;
	rulesForContEmp;
	
	printRemainingYearsOfService();
	printConsolidatedSalary();
	
}

====================================================================
