package pageObjects;

import groovy.json.JsonOutput;
import io.restassured.path.json.JsonPath;
import org.testng.Assert;
import stepDefinations.Files.payload;

public class ComplexJsonParse {
    public static void main(String[] args) {
        JsonPath js = new JsonPath(payload.CoursePrice());

        //Print No of courses returned by API
        int count = js.getInt("courses.size()");
        System.out.println(count);
        //Print Purchase Amount
        int amt=js.getInt("dashboard.purchaseAmount");
        System.out.println(amt);
        //Print Title of the first course
        String firstTitle=js.getString("courses[0].title");
        int price= js.getInt("courses[0].price");
        System.out.println(firstTitle);

        //Print All course titles and their respective Prices
        for(int i=0; i<count; i++){
            int amount= js.getInt("courses["+i+"].price");
           String title= js.getString("courses["+i+"].title");
            System.out.println("price = "+ amount +" "+ '\n' + "title = " + title);


        }
       // int copies=js.getInt("courses[2].copies");
        //System.out.println(copies);
        //or another way to Print no of copies sold by RPA Course
        System.out.println("Print no of copies sold by RPA Course:");
        for (int i=0; i<count; i++){

            String title= js.getString("courses["+i+"].title");
            if(title.equals("RPA")) {
                int copies = js.getInt("courses[" + i + "].copies");
                System.out.println(copies);
                break;
            }
        }

//Verify if Sum of all Course prices matches with Purchase Amount

        int price1= js.getInt("courses[0].price");
        int price2= js.getInt("courses[1].price");
        int price3= js.getInt("courses[2].price");
        if (price1+price2+price3 == amt)
        {
            System.out.println("TRUE");
        }
        else{
            System.out.println("FALSE");
        }
        int sum=0;

        for(int i=0; i<count; i++){
            int amount= js.getInt("courses["+i+"].price");
            int copies= js.getInt("courses["+i+"].copies");
            int finalamt=amount * copies;
            sum=sum+finalamt;

        }
        Assert.assertEquals(sum,amt);


    }
}