package com.katchfashion.traitsbox

import java.util.Date

case class Anonymous(id: String, createdAt: Date = new Date()) extends Visitor
case class User(id: String, email: String, createdAt: Date = new Date()) extends Visitor

