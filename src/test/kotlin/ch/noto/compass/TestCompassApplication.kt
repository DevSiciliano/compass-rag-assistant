package ch.noto.compass

import org.springframework.boot.fromApplication
import org.springframework.boot.with


fun main(args: Array<String>) {
    fromApplication<CompassApplication>().with(TestcontainersConfiguration::class).run(*args)
}
