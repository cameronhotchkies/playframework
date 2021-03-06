/*
 * Copyright (C) 2009-2019 Lightbend Inc. <https://www.lightbend.com>
 */

package play.sbt

import sbt.Keys._
import sbt.Def
import sbt.Level
import sbt.Scope
import sbt.Settings
import sbt.State
import sbt.internal.LogManager
import sbt.internal.util.ManagedLogger

/**
 * Fix compatibility issues for PlayImport. This is the version compatible with sbt 1.0.
 */
private[sbt] trait PlayImportCompat {
  // has nothing
}
