
import demo.PikachuRequest;
import demo.PikachuResponse;
import demo.controller.PikachuController;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.hamcrest.Matchers;
import org.junit.Assert;
import org.junit.Test;

public class Pikachu{

    PikachuController pikachuController = new PikachuController();


    //HTTP REQUEST GET
    @Test
    public void getPikachu(){
        //instance object "response" for HTTP REQUEST "GET"
        Response response = RestAssured
                .given()
                .baseUri("https://pokeapi.co/")
                .basePath("/api")
                .log()
                .all()
                .header("Content-type","application/json")
                .header("Accept","*/*")
                .get("/v2/pokemon");

        //get body of response and print them
        response.getBody().prettyPrint();
        System.out.println(response.getStatusCode());
        Assert.assertEquals(200,response.getStatusCode());
        Assert.assertThat("Too Late Response",response.getTime(), Matchers.lessThan(10000L));

        //Validate if bulbasaur is pokemon name
        Assert.assertEquals("pokeapi",response.path("name"));

        //Deserializer
        // All of EmployeeResponse filled in variable pikachuResponse
        PikachuResponse pikachuResponse = response.as(PikachuResponse.class);
//        // Print status from pikachuResponse
//        System.out.println(pikachuResponse.getResults());

    }

    //HTTP REQUEST POST
    @Test
    public void createPikachu(){
        //Serialize
        //initialize employeeRequest for EmployeeRequest
        PikachuRequest pikachuRequest = new PikachuRequest();
//        pikachuRequest.setAbilities();
//        pikachuRequest.setBaseExperience();
//        pikachuRequest.setForms();

        Response response = PikachuController.createPikachu(pikachuRequest);

        //get body of response and print them
        response.getBody().prettyPrint();
        System.out.println(response.getStatusCode());
    }

}
