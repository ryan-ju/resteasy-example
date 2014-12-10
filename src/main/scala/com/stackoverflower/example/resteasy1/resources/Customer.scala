package com.stackoverflower.example.resteasy1.resources

import javax.ws.rs.core.MediaType
import javax.ws.rs.{PathParam, Produces, GET, Path}

import com.stackoverflower.example.resteasy1.models.{Book, BookList}

import scala.collection.JavaConverters._

/**
 * Created by ryan on 01/12/14.
 */
@Path("/customers")
class Customer {
  @GET
  @Path("/{customerId}/recommendations")
  @Produces(value = Array(MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON))
  def getPreference(@PathParam("customerId") customerId: String): BookList = {
    val bookList = new BookList
    val book = new Book
    book.setTitle("Scala for the Impatient")
    book.setAuthor("Cay S. Horstmann")
    book.setYear(2012)
    bookList.setBooks(List(book).asJava)
    return bookList
  }
}
