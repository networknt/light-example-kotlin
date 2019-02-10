
package com.networknt.petstore.handler
import assertk.all
import assertk.assertThat
import mu.KotlinLogging
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith


@ExtendWith(LightTestServer::class)
class PetsPostHandlerTest {
    companion object {
        val log = KotlinLogging.logger {}
    }

    @Test
    fun `test PetsPostHandlerTest() PetsPostHandler success` () {
        val response = LightTestServer.makePostRequest("/v1/pets", "{\"id\":1,\"name\":\"dog\"}")
        
        assertThat(response).all {
            rcIsEqualTo(200)
        }
    }
}

