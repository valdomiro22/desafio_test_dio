package me.dio.credit.application.system.service

import io.mockk.impl.annotations.InjectMockKs
import io.mockk.impl.annotations.MockK
import io.mockk.junit5.MockKExtension
import me.dio.credit.application.system.entity.Credit
import me.dio.credit.application.system.repository.CreditRepository
import me.dio.credit.application.system.service.impl.CreditService
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.springframework.test.context.ActiveProfiles


@ActiveProfiles("test")
@ExtendWith(MockKExtension::class)
class CreditSeriviceTest {
    @MockK lateinit var creditRepository: CreditRepository
    @InjectMockKs lateinit var creditService: CreditService

    @Test
    fun `should create credit`() {
        // given


        // when

        // then
    }

    private fun buildCredit(

    ) = Credit(

    ),

}