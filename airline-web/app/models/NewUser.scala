package models

case class NewUser(
  username: String, 
  password: String,
  email: String,
  recaptchaToken: String,
  airlineName : String
)

