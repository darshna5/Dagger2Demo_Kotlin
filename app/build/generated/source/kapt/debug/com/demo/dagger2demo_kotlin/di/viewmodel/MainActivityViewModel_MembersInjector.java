// Generated by Dagger (https://dagger.dev).
package com.demo.dagger2demo_kotlin.di.viewmodel;

import com.demo.dagger2demo_kotlin.di.RetroServiceInterface;
import dagger.MembersInjector;
import dagger.internal.InjectedFieldSignature;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class MainActivityViewModel_MembersInjector implements MembersInjector<MainActivityViewModel> {
  private final Provider<RetroServiceInterface> mServiceProvider;

  public MainActivityViewModel_MembersInjector(Provider<RetroServiceInterface> mServiceProvider) {
    this.mServiceProvider = mServiceProvider;
  }

  public static MembersInjector<MainActivityViewModel> create(
      Provider<RetroServiceInterface> mServiceProvider) {
    return new MainActivityViewModel_MembersInjector(mServiceProvider);
  }

  @Override
  public void injectMembers(MainActivityViewModel instance) {
    injectMService(instance, mServiceProvider.get());
  }

  @InjectedFieldSignature("com.demo.dagger2demo_kotlin.di.viewmodel.MainActivityViewModel.mService")
  public static void injectMService(MainActivityViewModel instance,
      RetroServiceInterface mService) {
    instance.mService = mService;
  }
}
