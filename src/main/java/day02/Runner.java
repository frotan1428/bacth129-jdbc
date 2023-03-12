package day02;

public class Runner {
    public static void main(String[] args) {
        //1. Step: Registration to the driver
        //2. Step: Create connection with database
        JdbcUtils.connectToDatabase("localhost","jdbc_db","jdbc_user","jdbcpass");

        //3. Step: Create statement
        JdbcUtils.createStatement();

        //4. Step: Execute the query
        //JdbcUtils.createTable("Students","name VARCHAR(20)","id INT","address VARCHAR(50)","tel BIGINT");

        JdbcUtils.insertDataIntoTable("Students","name 'John'");
        JdbcUtils.insertDataIntoTable("Students","name 'Mark'","id 123","tel 1234567890","address 'Ankara'");

        JdbcUtils.dropTable("Students");

        //5. Step: Close the connection and statement
        JdbcUtils.closeConnectionAndStatement();
    }
}
