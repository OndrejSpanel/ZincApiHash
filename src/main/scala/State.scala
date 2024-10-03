

object State {

  // Provides works, which can be offered as actions for instance through ActionsAtHouseDoor
  // examples: "send lumberjack to saw the log", "buy bread in the farmers shop"
  trait WorkProvider {
    def workStateIds: Seq[StateId]
  }

}

case class State(
  entities: Entities,
  timeUs: Long
)
