package demo.controller;

import demo.PikachuRequest;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class PikachuController {
    public static Response createPikachu(PikachuRequest pikachuRequest){

        //instance object "response" for HTTP REQUEST "POST"

        Response response = RestAssured
                .given()
                .baseUri("https://pokeapi.co/")
                .basePath("/api")
                .log()
                .all()
                .header("Content-type","application/json")
                .header("Accept","*/*")
                .body(pikachuRequest) //requestBody
                .post("/v1/pokemon/create");

        return response;

    }
}
