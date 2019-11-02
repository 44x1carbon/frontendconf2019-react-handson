package counter

import kotlinx.html.js.onClickFunction
import kotlinx.html.onClick
import react.*
import react.dom.button
import react.dom.div
import react.dom.p

data class CounterProps(
    val initCount: Int = 0
): RProps {

}

val counter = functionalComponent<CounterProps> { props ->
    val (count, setCount) = useState(props.initCount)

    div {
        p {
            + "You clicked $count times"
        }
        button {
            attrs {
                onClickFunction = {
                    setCount(count + 1)
                }
            }
            + "Click me"
        }
    }
}

fun RBuilder.counter(props: CounterProps) = child(counter, props)