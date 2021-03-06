package com.quangnguyen.hoga.util

import io.reactivex.Scheduler
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers


class SchedulerProvider {

  val uiScheduler: Scheduler
  val ioScheduler: Scheduler

  init {
    uiScheduler = AndroidSchedulers.mainThread()
    ioScheduler = Schedulers.io()
  }
}
