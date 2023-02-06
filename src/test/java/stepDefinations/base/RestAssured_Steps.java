package stepDefinations.base;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
import org.testng.Assert;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import org.testng.Assert;
import pageObjects.LocationDto;
import pageObjects.ResponseDTO;
import pageObjects.dto;
import stepDefinations.Files.ReUseableMethods;
import stepDefinations.Files.payload;

import java.util.*;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;


public class RestAssured_Steps {
    public static void main(String[] args){
        dto dt = new dto();
        LocationDto ldt = new LocationDto();
        ldt.setLat(-38.383494);
        ldt.setLng(33.427362);
        dt.setLocation(ldt);
        dt.setAccuracy(50);
        dt.setName("Frontline house");
        dt.setPhone_number("(+91) 983 893 3937");
        dt.setAddress("23 Orwell Woods");

        ArrayList<String> types1 = new ArrayList<>();
        types1.add("shoe park");
        types1.add("shop");

        dt.setTypes(types1);
        dt.setWebsite("http://google.com");
        dt.setLanguage("French-IN");

        RestAssured.baseURI= "https://rahulshettyacademy.com";

        // ===== Working Code=======

//        String response=given().log().all().queryParam("key", "qaclick123").header("Content-Type","application/json")
//                .body(payload.AddPlace()).when().post("maps/api/place/add/json")
//                .then().assertThat().statusCode(200).body("scope", equalTo("APP"))
//                .header("server", "Apache/2.4.41 (Ubuntu)").extract().response().asString();

        // ==== Working Code=======

//        String response=given().log().all().queryParam("key", "qaclick123").header("Content-Type","application/json")
//                .body(dt).when().post("maps/api/place/add/json")
//                .then().assertThat().statusCode(200).body("scope", equalTo("APP"))
//                .header("server", "Apache/2.4.41 (Ubuntu)").extract().response().asString();

        ResponseDTO rc = given().log().all().queryParam("key", "qaclick123").header("Content-Type","application/json")
                .body(dt).when().post("maps/api/place/add/json").as(ResponseDTO.class);

        System.out.println(rc.getPlace_id());

        String Test = rc.getPlace_id();


              //  then().body().toString();
                                //.assertThat().statusCode(200).body("scope",equalsTo "APP").

     //   Assert.assertEquals(response.getStatusCode(),200);
     //   System.out.println(response.body().asString());
        //Assert.assertEquals(response.body("scope"), );
    //    Assert.assertEquals(response.header("Server"), ("Apache/2.4.41 (Ubuntu)"));

//        JsonPath js= new JsonPath(response);
//        String Test = js.getString("place_id");
//        String Test2 =  js.getString("id");

        System.out.println("Guuuu +++++" + Test);

         given().log().all().queryParam("key", "qaclick123").header("Content-Type","application/json")
                .body(payload.PutPlace(Test)).when().put("maps/api/place/update/json").then().log().all().assertThat().statusCode(200)
                 .body("msg", equalTo("Address successfully updated"));


    String getPlaceResponse =    given().log().all().queryParam("key", "qaclick123").queryParam("place_id", Test)
                .when().get("maps/api/place/get/json").then().log().all().assertThat().statusCode(200)
                .extract().response().asString();

       JsonPath js1= ReUseableMethods.rawToJson(getPlaceResponse);
    //JsonPath js1= new JsonPath(getPlaceResponse);
    js1.getString("address" );
    Assert.assertEquals("70 Summer walk, USA", js1.getString("address" ) );








    }
}
