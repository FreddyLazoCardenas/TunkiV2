package pe.indigital.tunki.user.di

import android.content.Context
import dagger.Module
import dagger.Provides
import pe.indigital.tunki.user.TunkiUserApp
import pe.indigital.tunki.user.UIThread
import pe.indigital.tunki.user.data.executor.JobExecutor
import pe.indigital.tunki.user.domain.executor.PostExecutionThread
import pe.indigital.tunki.user.domain.executor.ThreadExecutor
import javax.inject.Singleton


//@Module(includes = [ApplicationModuleBinds::class])
@Module
object ApplicationModule {


  /*  @Provides
    @Singleton
    internal fun provideThreadExecutor(jobExecutor: JobExecutor): ThreadExecutor {
        return jobExecutor
    }

    @Provides
    @Singleton
    internal fun providePostExecutionThread(uiThread: UIThread): PostExecutionThread {
        return uiThread
    }*/

}

/*@Module
abstract class ApplicationModuleBinds {

    @Singleton
    @Binds
    abstract fun bindRepository(repo: DefaultTasksRepository): TasksRepository
}*/