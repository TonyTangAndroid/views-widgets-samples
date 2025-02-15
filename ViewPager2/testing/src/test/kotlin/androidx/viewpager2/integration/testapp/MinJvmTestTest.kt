package androidx.viewpager2.integration.testapp

import android.content.Context
import androidx.test.core.app.ApplicationProvider
import com.google.common.truth.Truth.assertThat
import org.junit.runner.RunWith
import org.robolectric.RobolectricTestRunner

@RunWith(RobolectricTestRunner::class)
class MinJvmTestTest {

  @org.junit.Test
  fun test123() {
    val context = ApplicationProvider.getApplicationContext<Context>()
    assertThat(context.packageName).isEqualTo("org.robolectric.default")
  }
}