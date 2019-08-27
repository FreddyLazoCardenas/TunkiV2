package pe.indigital.tunki.user

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import io.reactivex.subscribers.DisposableSubscriber

abstract class BaseInteractor : ViewModel() {

    val loadingData: MutableLiveData<Boolean> = MutableLiveData()

    fun showLoading() = loadingData.postValue(true)
    fun hideLoading() = loadingData.postValue(false)

    abstract fun init()

    abstract fun dispose()

    abstract inner class BaseSubscriber<T> : DisposableSubscriber<T>() {
        override fun onComplete() {
            hideLoading()
        }

        override fun onNext(value: T) {
            hideLoading()
        }

        override fun onError(error: Throwable) {
            Log.d(TAG, error.message, error)
            //showError { ErrorMapper.transform(error) }
        }
    }

    companion object {
        val TAG: String = BaseInteractor::class.java.canonicalName.orEmpty()
    }
}