package com.stackoverflower.example.resteasy1.models

import scala.beans.BeanProperty

/**
 * Created by ryan on 01/12/14.
 */

class Book {
  @BeanProperty
  var title: String = null
  @BeanProperty
  var author: String = null
  @BeanProperty
  var year: Int = 0
}
