package demo;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"name",
"url"
})
public class Results {

@JsonProperty("name")
private List<String> name = null;
@JsonProperty("url")
private List<String> url = null;

@JsonProperty("name")
public List<String> getName() {
return name;
}

@JsonProperty("name")
public void setName(List<String> name) {
this.name = name;
}

@JsonProperty("url")
public List<String> getUrl() {
return url;
}

@JsonProperty("url")
public void setUrl(List<String> url) {
this.url = url;
}

}