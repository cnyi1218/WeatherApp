package com.example.haoruyipipipc.weatherapp.data

data class ForecastResult (val city:City,val list:List<Forecast>)

data class City (val id:Long,val name:String,val coord:Coordinates,val country:String,val population:Int)

data class Forecast(val dt:Long,val temp:Temprature,val pressure:Float,
                    val humidity:Int,val weather:List<Weather>,
                    val speed:Float,val deg:Int,val cloudes:Int,
                    val rain:Float)

data class Coordinates(val lon:Float,val lat:Float)

data class Temprature(val day:Float, val min:Float,val max:Float,
                      val night:Float,val eve:Float,val morn:Float)

data class Weather(val id:Long,val main:String, val dwscription:String,val icon:String)
