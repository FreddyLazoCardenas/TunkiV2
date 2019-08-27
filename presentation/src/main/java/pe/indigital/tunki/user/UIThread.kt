package pe.indigital.tunki.user

import io.reactivex.Scheduler
import io.reactivex.android.schedulers.AndroidSchedulers
import pe.indigital.tunki.user.domain.executor.PostExecutionThread
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class UIThread @Inject
constructor() : PostExecutionThread {

    override val scheduler: Scheduler = AndroidSchedulers.mainThread()
}