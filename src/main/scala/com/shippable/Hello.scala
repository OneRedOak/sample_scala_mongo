package com.shippable

import com.mongodb.casbah.Imports._

class HelloWorld {

   def returnValue(key:String): Long= {
      val mongoClient = MongoClient("localhost", 27017)
      val db = mongoClient("test")
      val coll = db("test")
      val a = MongoDBObject("hello" -> "world")
      coll.insert(a)
      //val data = mongoColl.findOne(a)
      //a.map(_.as[String](key)).getOrElse(0)("hello")
      val count = coll.count()
      coll.drop()
      return count
   }
}