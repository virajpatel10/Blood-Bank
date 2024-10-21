# Blood Bank Management System
 
## Project Overview

The Blood Bank Management System efficiently manages donor and recipient details, ensuring seamless tracking of blood availability and donation history. This system enhances code maintainability with modular design and robust exception handling, using local storage for data management.

## Features

Donor Management: Manages essential donor details, including blood type, donation date, and availability status.
Recipient Management: Handles recipient requests for blood, ensuring compatibility checks for donor blood types.
Blood Inventory Management: Tracks blood availability by type and updates status as donations are made or blood is issued to recipients.
Error Management: Custom exception handling to improve data validation and reduce data errors.

## Technologies Used

Java
Local Storage (File Handling/Java I/O)

## Modules Description

### Donor Management Module:
Stores and retrieves donor information, including contact details and blood type.
Handles operations for adding new donors, updating donation status, and querying availability.
### Recipient Management Module:
Processes blood requests from recipients and ensures compatibility between donor and recipient blood types.
Tracks recipient information and updates blood inventory after successful matches.
### Blood Inventory Module:
Maintains real-time inventory of available blood based on type and quantity.
Automatically updates as donations are added or blood is issued.
### Error Handling Module:
Implements custom exception handling to ensure smooth operation and validation of data input.
Reduces errors by validating donor and recipient data at the point of entry.

## Usage

Add new donor details via the Donor Management system.
Add recipient requests and check for compatible blood types.
Track and manage blood inventory, ensuring efficient usage and stock updates.
Handle exceptions and invalid data with the built-in error management system.

## Installation Instructions

1. git clone https://github.com/virajpatel10/blood-bank-system.git
2. cd blood-bank-system
3. mvn clean install
4. java -jar target/blood-bank-system.jar
