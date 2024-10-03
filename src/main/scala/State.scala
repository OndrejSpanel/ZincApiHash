

object State {

  trait WorkProvider {
    def workStateIds: Seq[StateId]
  }

}

case class State(entities: Entities)
