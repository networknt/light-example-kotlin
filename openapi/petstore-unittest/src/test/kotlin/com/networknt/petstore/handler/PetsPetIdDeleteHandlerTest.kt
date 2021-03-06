
package com.networknt.petstore.handler
import assertk.all
import assertk.assertThat
import mu.KotlinLogging
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith


@ExtendWith(LightTestServer::class)
class PetsPetIdDeleteHandlerTest {
    companion object {
        val log = KotlinLogging.logger {}
    }

    @Test
    fun `test PetsPetIdDeleteHandlerTest() PetsPetIdDeleteHandler success` () {
        val response = LightTestServer.makeGetRequest("/v1/pets/GlohLroGgWM")
        
        assertThat(response).all {
            rcIsEqualTo(200)
            bodyContains("id")
        }
    }
}

