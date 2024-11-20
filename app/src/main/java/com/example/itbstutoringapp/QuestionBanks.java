package com.example.itbstutoringapp;

import java.util.ArrayList;
import java.util.List;

public class QuestionBanks {

    private static List<QuestionsList> programmingQuestion() {

        final List<QuestionsList> questionsLists = new ArrayList<>();


        final QuestionsList question1 = new QuestionsList("What is a correct syntax to output \"Hello World\" in Java?", "echo(\"Hello World\")", "Console.WriteLine(\"Hello World\")", "System.out.println(\"Hello World\")", "print(\"Hello World\")", "System.out.println(\"Hello World\")", "");
        final QuestionsList question2 = new QuestionsList("Which data type is used to create a variable that should store text?", "Txt", "String", "myString", "string", "String", "");
        final QuestionsList question3 = new QuestionsList("Which method can be used to find the length of a string?", "len()", "getLength()", "getSize()", "lenght.size", "length()", "");
        final QuestionsList question4 = new QuestionsList("To declare an array in Java, define the variable type with:", "{}", "[]", "()", "<>", "[]", "");
        final QuestionsList question5 = new QuestionsList("Array indexes start with:", "0", "1", "index", "[]", "0", "");

        questionsLists.add(question1);
        questionsLists.add(question2);
        questionsLists.add(question3);
        questionsLists.add(question4);
        questionsLists.add(question5);

        return questionsLists;

    }

    private static List<QuestionsList> mobileApplicationDevelopmentQuestion() {

        final List<QuestionsList> questionsLists = new ArrayList<>();


        final QuestionsList question1 = new QuestionsList("To declare an array in Java, define the variable type with:", "{}", "[]", "()", "<>", "[]", "");
        final QuestionsList question2 = new QuestionsList("Array indexes start with:", "0", "1", "index", "[]", "0", "");
        final QuestionsList question3 = new QuestionsList("Which method can be used to find the length of a string?", "len()", "getLength()", "getSize()", "lenght.size", "length()", "");
        final QuestionsList question4 = new QuestionsList("Which data type is used to create a variable that should store text?", "Txt", "String", "myString", "string", "String", "");
        final QuestionsList question5 = new QuestionsList("Which method can be used to find the length of a string?", "len()", "getLength()", "getSize()", "lenght.size", "length()", "");

        questionsLists.add(question1);
        questionsLists.add(question2);
        questionsLists.add(question3);
        questionsLists.add(question4);
        questionsLists.add(question5);

        return questionsLists;
    }

    private static List<QuestionsList> InformationSystemsQuestions() {

        final List<QuestionsList> questionsLists = new ArrayList<>();


        final QuestionsList question1 = new QuestionsList("Which MySQL statement is used to select data from a database?", "EXTRACT", "SELECT", "GET", "ORDER BY", "SELECT", "");
        final QuestionsList question2 = new QuestionsList("Which MYSQL statement is used to insert new data in a database?", "INSERT INTO", "ADD RECORD", "ADD NEW", "NEW RECORD", "ADD RECORD", "");
        final QuestionsList question3 = new QuestionsList("With MySQL, how do you select a column named \"FirstName\" from a table named \"Persons\"?", "EXTRACT FirstName FROM Persons", "SELECT Persons.FirstName", "SELECT FirstName FROM Persons", "RETRIEVE column.FirstName FROM table.Persons", "SELECT FirstName FROM Persons", "");
        final QuestionsList question4 = new QuestionsList("Advantages of a DBMS", "Improved data sharing", "supports only one user at a time ", "Cost of Hardware and Software", "Frequency Upgrade/Replacement Cycles", "Improved data sharing", "");
        final QuestionsList question5 = new QuestionsList("Meaning of Data Inconsistency", "different and conflicting versions of same data occur at different places", "abnormalities when all changes in redundant data not made correctly", "same data stored unnecessarily in different places", "instructions and rules that govern the design and use of the database system", "different and conflicting versions of same data occur at different places", "");
        questionsLists.add(question1);
        questionsLists.add(question2);
        questionsLists.add(question3);
        questionsLists.add(question4);
        questionsLists.add(question5);

        return questionsLists;
    }

    private static List<QuestionsList> SoftwareEngineering1Questions() {

        final List<QuestionsList> questionsLists = new ArrayList<>();


        final QuestionsList question1 = new QuestionsList("Which MySQL statement is used to select data from a database?", "EXTRACT", "SELECT", "GET", "ORDER BY", "SELECT", "");
        final QuestionsList question2 = new QuestionsList("Which MYSQL statement is used to insert new data in a database?", "INSERT INTO", "ADD RECORD", "ADD NEW", "NEW RECORD", "ADD RECORD", "");
        final QuestionsList question3 = new QuestionsList("With MySQL, how do you select a column named \"FirstName\" from a table named \"Persons\"?", "EXTRACT FirstName FROM Persons", "SELECT Persons.FirstName", "SELECT FirstName FROM Persons", "RETRIEVE column.FirstName FROM table.Persons", "SELECT FirstName FROM Persons", "");
        final QuestionsList question4 = new QuestionsList("Advantages of a DBMS", "Improved data sharing", "supports only one user at a time ", "Cost of Hardware and Software", "Frequency Upgrade/Replacement Cycles", "Improved data sharing", "");
        final QuestionsList question5 = new QuestionsList("Meaning of Data Inconsistency", "different and conflicting versions of same data occur at different places", "abnormalities when all changes in redundant data not made correctly", "same data stored unnecessarily in different places", "instructions and rules that govern the design and use of the database system", "different and conflicting versions of same data occur at different places", "");
        questionsLists.add(question1);
        questionsLists.add(question2);
        questionsLists.add(question3);
        questionsLists.add(question4);
        questionsLists.add(question5);

        return questionsLists;
    }

    private static List<QuestionsList> TechnopreneurshipQuestions() {

        final List<QuestionsList> questionsLists = new ArrayList<>();


        final QuestionsList question1 = new QuestionsList("Which MySQL statement is used to select data from a database?", "EXTRACT", "SELECT", "GET", "ORDER BY", "SELECT", "");
        final QuestionsList question2 = new QuestionsList("Which MYSQL statement is used to insert new data in a database?", "INSERT INTO", "ADD RECORD", "ADD NEW", "NEW RECORD", "ADD RECORD", "");
        final QuestionsList question3 = new QuestionsList("With MySQL, how do you select a column named \"FirstName\" from a table named \"Persons\"?", "EXTRACT FirstName FROM Persons", "SELECT Persons.FirstName", "SELECT FirstName FROM Persons", "RETRIEVE column.FirstName FROM table.Persons", "SELECT FirstName FROM Persons", "");
        final QuestionsList question4 = new QuestionsList("Advantages of a DBMS", "Improved data sharing", "supports only one user at a time ", "Cost of Hardware and Software", "Frequency Upgrade/Replacement Cycles", "Improved data sharing", "");
        final QuestionsList question5 = new QuestionsList("Meaning of Data Inconsistency", "different and conflicting versions of same data occur at different places", "abnormalities when all changes in redundant data not made correctly", "same data stored unnecessarily in different places", "instructions and rules that govern the design and use of the database system", "different and conflicting versions of same data occur at different places", "");
        questionsLists.add(question1);
        questionsLists.add(question2);
        questionsLists.add(question3);
        questionsLists.add(question4);
        questionsLists.add(question5);

        return questionsLists;
    }

    private static List<QuestionsList> ProfessionalCommunication() {

        final List<QuestionsList> questionsLists = new ArrayList<>();


        final QuestionsList question1 = new QuestionsList("Which MySQL statement is used to select data from a database?", "EXTRACT", "SELECT", "GET", "ORDER BY", "SELECT", "");
        final QuestionsList question2 = new QuestionsList("Which MYSQL statement is used to insert new data in a database?", "INSERT INTO", "ADD RECORD", "ADD NEW", "NEW RECORD", "ADD RECORD", "");
        final QuestionsList question3 = new QuestionsList("With MySQL, how do you select a column named \"FirstName\" from a table named \"Persons\"?", "EXTRACT FirstName FROM Persons", "SELECT Persons.FirstName", "SELECT FirstName FROM Persons", "RETRIEVE column.FirstName FROM table.Persons", "SELECT FirstName FROM Persons", "");
        final QuestionsList question4 = new QuestionsList("Advantages of a DBMS", "Improved data sharing", "supports only one user at a time ", "Cost of Hardware and Software", "Frequency Upgrade/Replacement Cycles", "Improved data sharing", "");
        final QuestionsList question5 = new QuestionsList("Meaning of Data Inconsistency", "different and conflicting versions of same data occur at different places", "abnormalities when all changes in redundant data not made correctly", "same data stored unnecessarily in different places", "instructions and rules that govern the design and use of the database system", "different and conflicting versions of same data occur at different places", "");
        questionsLists.add(question1);
        questionsLists.add(question2);
        questionsLists.add(question3);
        questionsLists.add(question4);
        questionsLists.add(question5);

        return questionsLists;
    }

    public static List<QuestionsList> getQuestions(String selectedModuleName) {

        switch (selectedModuleName) {
            case "Programming II":
                return programmingQuestion();
            case "Mobile Application Development":
                return mobileApplicationDevelopmentQuestion();

            case "Software Engineering":
                return SoftwareEngineering1Questions();
            case "Technopreneurship":
                return TechnopreneurshipQuestions();
            default:
                return ProfessionalCommunication();

        }
    }
}

