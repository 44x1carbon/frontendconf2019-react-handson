package app

import counter.CounterProps
import counter.counter
import react.*
import react.dom.*

@JsModule("src/app/logo.svg")
external val logo: dynamic

val app = functionalComponent<RProps> {
    div(classes = "App") {
        header(classes = "App-header") {
            img(classes = "App-logo") {
                attrs {
                    src = logo
                    alt = "logo"
                }
            }
            p {
                +"Edit "
                code { +"src/App.js" }
                + " and save to reload."
            }
            a(classes = "App-link") {
                attrs {
                    href = "https://reactjs.org"
                    target = "_blank"
                    rel = "noopener noreferrer"
                }
                + "Lean React"
            }
//            counter(CounterProps(initCount = 0))
            counter(0)
        }

    }
}

fun RBuilder.app() = child(app) {}
