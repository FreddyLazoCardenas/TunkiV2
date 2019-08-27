package pe.indigital.tunki.user.di

import android.content.Context
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import pe.indigital.tunki.user.TunkiUserApp
import pe.indigital.tunki.user.domain.executor.PostExecutionThread
import pe.indigital.tunki.user.domain.executor.ThreadExecutor
import javax.inject.Singleton


@Singleton
@Component(
    modules = [
        ApplicationModule::class,
        AndroidSupportInjectionModule::class
    ])
interface ApplicationComponent : AndroidInjector<TunkiUserApp> {

    @Component.Factory
    interface Factory {
        fun create(@BindsInstance applicationContext: Context): ApplicationComponent
    }

}