import java.time.LocalDate
import java.time.LocalDateTime
import java.time.temporal.ChronoUnit
import kotlin.math.pow

class Gigasecond(localDateTime:LocalDateTime) {
    constructor(localDate: LocalDate) : this(localDate.atStartOfDay())

    private val gigaSeconds = 10.0.pow(9.0).toLong()

    val date: LocalDateTime = localDateTime.plus(gigaSeconds, ChronoUnit.SECONDS)
}
