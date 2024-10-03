
type StateId = AnyRef | Int

trait EntityState extends State.WorkProvider {

  def parentEntity(state: State): Option[EntityState] = None.flatMap(state.entities.get)

  def stateId: StateId = ???
}
