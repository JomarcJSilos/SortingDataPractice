package edu.sfsu.cs.datastructures;
import java.util.*;

class ageCompare implements Comparator<UserInformation>
{
    public int compare(UserInformation User1, UserInformation User2)
    {
        if (User1.getAge()== User2.getAge())
            return 0;
        else if (User1.getAge() < User2.getAge())
            return 1;
        else
            return -1;
    }
}

public class MainPart1 {
    /*
    * Question 1:
    * - In this question you will use the Data.users array that includes
    * a list of users. Formatted as : firstname,lastname,age,email,gender,city,state
    * - Create a User class that should parse all the parameters for each user.
    * - Insert each of the users in a list.
    * - Print out the TOP 10 oldest users.
    * */

    public static void main(String[] args) {

        ArrayList<UserInformation> dataList = new ArrayList<>();

        for (String str : edu.sfsu.cs.datastructures.Data.users) {
            String dataFields[] = str.split(",");
            UserInformation userData = new UserInformation();
            userData.setFirstName(dataFields[0]);
            userData.setLastName(dataFields[1]);
            userData.setAge(Integer.parseInt(dataFields[2]));
            userData.setEmailAddress(dataFields[3]);
            userData.setGender(dataFields[4]);
            userData.setCity(dataFields[5]);
            userData.setState(dataFields[6]);
            dataList.add(userData);

        }

        Collections.sort(dataList, new ageCompare());

        for(int i = 0; i < 10; i++){
          System.out.println(dataList.get(i));
        }
    }
}