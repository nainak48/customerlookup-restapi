###############################################
Find all customers:
###############################################
url : http://localhost:8090/customers
Request method : GET,
Response : []


###############################################
Add new Customer:
###############################################
url : http://localhost:8090/customers/
Request method : POST,
payload : 
	{
		"customerId": 110011,
		"foreName": "naina",
		"surName": "kumari",
		"dateOfBirth": "2010-05-27"
	}
Response : []



###############################################
Update existing Customer:
###############################################
url : http://localhost:8090/customers/1
Request method : PUT,
payload : 
	{
		"customerId": 110011,
		"foreName": "naina",
		"surName": "kumari",
		"dateOfBirth": "2010-05-27"
	}
Response : []



###############################################
Delete existing Customer:
###############################################
url : http://localhost:8090/customers/1/
Request method : DELETE,
Response : []



###############################################
Find account details of customer by customerID
###############################################
url : http://localhost:8090/customers/1/accounts
Request method : GET,
Response : []



###############################################
Add an account for Customer
###############################################
url : http://localhost:8090/customers/1/accounts
Request method : POST,
payload : 
	{
		"accountId": 1101,
		"accountNumber": "2019110001"
	}
Response : []



###############################################
Update existing Account:
###############################################
url : http://localhost:8090/customers/1/accounts/1101

Request method : PUT,
payload : 
	{
		"accountId": 1101,
		"accountNumber": "2019110001-updated"
	}
Response : []



###############################################
Delete existing Account:
###############################################
url : http://localhost:8090/customers/1/accounts/1101
Request method : DELETE,
Response : []
	

	