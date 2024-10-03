

object Entities {

  // change comment -HERE-, or rename local variable below
  def f(): Unit = {
    val add149 = 0
  }
}

case class Entities(active: Map[Int, EntityState] = Map.empty) {
  def get[T <: EntityState](id: Int): Option[EntityState] = active.get(id)

}
