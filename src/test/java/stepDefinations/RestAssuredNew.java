package stepDefinations;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;
//private static response;



public class RestAssuredNew {
    @Given("I make a post request")
    public void i_make_a_post_request() {
        RestAssured.baseURI= "https://rahulshettyacademy.com";
        Response response =RestAssured.given().log().all().queryParam("key","qaclick123").header("Content-Type", "application/json")
                .body("{\n" +
                        "  \"location\": {\n" +
                        "    \"lat\": -38.383494,\n" +
                        "    \"lng\": 33.427362\n" +
                        "  },\n" +
                        "  \"accuracy\": 50,\n" +
                        "  \"name\": \"Frontline house\",\n" +
                        "  \"phone_number\": \"(+91) 983 893 3937\",\n" +
                        "  \"address\": \"23 Orwell Woods\",\n" +
                        "  \"types\": [\n" +
                        "    \"shoe park\",\n" +
                        "    \"shop\"\n" +
                        "  ],\n" +
                        "  \"website\": \"http://google.com\",\n" +
                        "  \"language\": \"French-IN\"\n" +
                        "}\n")
                .when().post("/maps/api/place/add/json");

    }

    @Then("Validate API returns {string} response code")
    public void validate_api_returns_response_code(String phonenumber) {

      //  Assert.assertEquals(response.getStatusCode(),200);
    }

    @And("Place Id is generated successfully")
    public void place_id_is_generated_successfully() {
    //    System.out.println(response.body().asString());

    }



}
