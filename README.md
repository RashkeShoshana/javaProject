# Transaction Utilization System

## Project Overview
The **Transaction Utilization System** is a Java-based application designed to process and analyze transactions associated with various schools. It reads transaction data from a CSV file, organizes it, and performs operations to find insights such as identifying the school with the highest number of transactions in a specific month and year.

---

## Features

1. **CSV Parsing**:
 - Reads and processes CSV files containing transaction and school data.
 - Converts each line in the CSV file into a structured row of data.

2. **Transaction Analysis**:
 - Identifies the school with the maximum number of transactions for a specific month and year.

3. **Data Organization**:
 - Structures and maps data to relevant school and transaction objects.

---

## Project Structure

### Packages
- `test.shani.krimelovsky`

### Key Classes

#### 1. `CSVReader`
Responsible for reading and parsing data from a CSV file. Converts each line of the file into a structured list of strings.

#### 2. ``School''
Represents a school with:
- `id`: A unique identifier.
- `name`: The name of the school.

#### 3. `Transaction`
Represents a transaction with:
- `id`: A unique identifier for the transaction.
- `description`: Description of the transaction.
- `schoolId`: ID of the school associated with the transaction.
- `price`: Price of the transaction.
- `date`: Date of the transaction.

#### 4. `TransactionUtil`
Contains utility methods for analyzing transactions. Key methods include:
- `buildSchoolsMap()`: Reads the CSV file and maps transactions to their corresponding schools.
- `maxSchoolForMonth(Month month, int year)`: Determines the school with the highest number of transactions in a specified month and year.

#### 5. `Main`
The entry point of the application. Demonstrates the functionality by printing the school with the highest number of transactions for March 2022.

---

## How to Use

1. **Prepare the CSV File**:
 - Ensure the `transactions.csv` file is located at `C:/transactions.csv`.
 - The file should have the following structure:
 csv
 SchoolID, SchoolName, TransactionID, Description, Date, Price
 1,School A,101,Description 1,01/03/2022,500.0
 2,School B,102,Description 2,15/03/2022,300.0
 ...
 ```

2. **Compile the Project**:
 - Use a Java compiler or an IDE (e.g., IntelliJ IDEA, Eclipse) to compile the project.

3. **Run the Application**:
 - Execute the `Main` class to view the results.

---

## Example Output

```
School{id='1', name='School A'}
```
The above output indicates that "School A" had the highest number of transactions in March 2022.

---

## Prerequisites
- Java Development Kit (JDK) 8 or later

---

## Future Enhancements
- Add support for multiple file paths for dynamic CSV input.
- Enhance error handling for invalid or missing CSV files.
- Implement a graphical user interface (GUI) for better usability.
- Support for additional transaction analysis metrics.
