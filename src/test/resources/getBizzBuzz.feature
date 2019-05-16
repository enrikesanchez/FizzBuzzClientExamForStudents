Feature: Get Fizz/Buzz values using rest api /fizzbuzz and an integer

  Scenario: Client makes call to GET /fizzbuzz/3
   When the client calls /fizzbuzz/3
   Then the client receives status code of 200
   And the client receives response value Fizz
   
  Scenario: Client makes call to GET /fizzbuzz/5
   When the client calls /fizzbuzz/5
   Then the client receives status code of 200
   And the client receives response value Buzz
   
  Scenario: Client makes call to GET /fizzbuzz/15
   When the client calls /fizzbuzz/15
   Then the client receives status code of 200
   And the client receives response value FizzBuzz   
   
  Scenario: Client makes call to GET /fizzbuzz/1
   When the client calls /fizzbuzz/1
   Then the client receives status code of 200
   And the client receives response value 1      