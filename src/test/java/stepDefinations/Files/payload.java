package stepDefinations.Files;

public class payload {
public static String AddPlace(){

    return "{\r\n" +
            "  \"location\": {\r\n" +
            "    \"lat\": -38.383494,\r\n" +
            "    \"lng\": 33.427362\r\n" +
            "  },\r\n" +
            "  \"accuracy\": 50,\r\n" +
            "  \"name\": \"Rahul Shetty Academy\",\r\n" +
            "  \"phone_number\": \"(+91) 983 893 3937\",\r\n" +
            "  \"address\": \"29, side layout, cohen 09\",\r\n" +
            "  \"types\": [\r\n" +
            "    \"shoe park\",\r\n" +
            "    \"shop\"\r\n" +
            "  ],\r\n" +
            "  \"website\": \"http://rahulshettyacademy.com\",\r\n" +
            "  \"language\": \"French-IN\"\r\n" +
            "}\r\n" +
            "";

}
public static String PutPlace(String placeId){
    return"{\n" +
            "\"place_id\":\""+placeId+"\",\n" +
            "\"address\":\"70 Summer walk, USA\",\n" +
            "\"key\":\"qaclick123\"\n" +
            "}";
}

public static String CoursePrice(){
    return "{\n" +
            "\t\"dashboard\":{\n" +
            "\t\t\"purchaseAmount\":910,\n" +
            "\t\t\"website\":\"rahulshettyacademy.com\"\n" +
            "\t},\n" +
            "\t\"courses\":[\n" +
            "\t\t{\n" +
            "\t\t\t\"title\":\"Selenium Python\",\n" +
            "\t\t\t\"price\":50,\n" +
            "\t\t\t\"copies\":6\n" +
            "\t\t},\n" +
            "\t\t{\n" +
            "\t\t\t\"title\":\"Cypress\",\n" +
            "\t\t\t\"price\":40,\n" +
            "\t\t\t\"copies\":4\n" +
            "\t\t},\n" +
            "\t\t{\n" +
            "\t\t\t\"title\":\"RPA\",\n" +
            "\t\t\t\"price\":45,\n" +
            "\t\t\t\"copies\":10\n" +
            "\t\t}\n" +
            "\t]\n" +
            "}";
}
}
