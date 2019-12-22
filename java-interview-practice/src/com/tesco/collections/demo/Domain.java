package com.tesco.collections.demo;

public class Domain {
int id;
String url;

public Domain(int id, String url) {
  this.id = id;
  this.url = url;
}

public Integer getId() {
  return Integer.valueOf(id);
}

public void setId(int id) {
  this.id = id;
}

public String getUrl() {
  return url;
}

public void setUrl(String url) {
  this.url = url;
}

}
