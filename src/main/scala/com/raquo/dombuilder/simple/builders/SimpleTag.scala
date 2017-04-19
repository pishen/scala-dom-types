package com.raquo.dombuilder.simple.builders

import com.raquo.dombuilder.builders.nodes.Tag
import com.raquo.dombuilder.simple.nodes.{SimpleElement, SimpleNode}
import org.scalajs.dom

class SimpleTag(val tagName: String) extends Tag[SimpleElement, SimpleNode, dom.Element] {

  override def createNode(): SimpleElement = {
    new SimpleElement(tagName)
  }
}