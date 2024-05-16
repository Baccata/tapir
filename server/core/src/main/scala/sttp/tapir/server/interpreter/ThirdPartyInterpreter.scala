package sttp.tapir.server.interpreter

import sttp.tapir.model.ServerRequest
import sttp.tapir.server.interceptor.RequestResult
import sttp.tapir.server.{model, _}

trait ThirdPartyInterpreter[F[_]] {

  def run[B, S](request: ServerRequest, fromRequestBody: RequestBody[F, S], toResponseBody: ToResponseBody[B, S]): F[RequestResult[B]]

}
