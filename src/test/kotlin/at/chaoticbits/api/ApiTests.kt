package at.chaoticbits.api


import org.testng.Assert
import org.testng.annotations.Test


/**
 * Test API Calls
 */
class ApiTests {


    companion object {
        private const val urlOK = "http://ip.jsontest.com/"
        private const val urlFail = "fail-test"
    }

    @Test
    private fun testFetch() {
        val response = Api.fetch(urlOK)

        Assert.assertNotNull(response)
        Assert.assertEquals(response.status, 200)
        Assert.assertNotNull(response.body)
    }

    @Test(expectedExceptions = [(IllegalStateException::class)], expectedExceptionsMessageRegExp = "Error fetching url.*")
    private fun testFetchFail() {
        val response = Api.fetch(urlFail)

        Assert.assertNull(response)
    }
}
