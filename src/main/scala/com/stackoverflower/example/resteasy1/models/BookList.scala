package com.stackoverflower.example.resteasy1.models

import javax.xml.bind.annotation.XmlRootElement

import scala.beans.BeanProperty

/**
 * Created by ryan on 01/12/14.
 */
@XmlRootElement
class BookList {
  @BeanProperty
  var books: java.util.List[Book] = null
}
