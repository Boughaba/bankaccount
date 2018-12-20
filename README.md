# BankAccount  
  
`Bank Account` is a sample to withraw money from account  
  
## Stack  
  1. Java8
  2. Junit
  3. Cucumber
## Features  
### Withdraw from account
> **Feature**: Withdraw from account  
  &nbsp;&nbsp;As a client of the bank  
  &nbsp;&nbsp;I want to withdraw money from my account  
  &nbsp;&nbsp;In order to have cash    
  &nbsp;&nbsp;**Scenario**: An existing client withdraws from his account  
    &nbsp;&nbsp;&nbsp;&nbsp;**Given** an existing client named "pierre-jean" with 100.0 EUR in his account  
    &nbsp;&nbsp;&nbsp;&nbsp;**When** he withdraws 10.0 EUR from his account  
    &nbsp;&nbsp;&nbsp;&nbsp;**Then** the new balance is 90.0 EUR  

> ```  