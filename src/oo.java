import jaggl.OpenGL;

final class oo {

   static Object[] d;
   static int a;
   static int e;
   static boolean c = false;
   static int b;


   static final Object[] a(Object[] var0, int var1, Object[] var2, Object[] var3) {
      if(null == var2[5]) {
         var2[5] = new boolean[2];
      }

      ++e;
      hp.a(var0, var2, var1 + 27466);
      ((boolean[])((boolean[])var2[5]))[0] = false;
      ((boolean[])((boolean[])var2[5]))[1] = false;
      var2[3] = var3;
      if(null != ((Object[])((Object[])var2[3]))[var1] && ((boolean[])((boolean[])((Object[])((Object[])var2[0]))[17]))[28] && ((boolean[])((boolean[])((Object[])((Object[])var2[0]))[17]))[3]) {
         Object[] var4 = rna.a((Object[])((Object[])var2[0]), '\u8b31', "uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x = dot(gl_NormalMatrix[0], ecVertex.xyz);\nwvVertex.y = dot(gl_NormalMatrix[1], ecVertex.xyz);\nwvVertex.z = dot(gl_NormalMatrix[2], ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = clamp((ecVertex.z-gl_Fog.start)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n", -21129);
         Object[] var5 = rna.a((Object[])((Object[])var2[0]), '\u8b30', "varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform vec2 waveIntensity;\nuniform float waveExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat waveFactor = pow(1.0-shoreFactor, waveExponent)-0.5;\nwaveFactor = -4.0*waveFactor*waveFactor+1.0;\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 1.0);\nvec4 surfaceColour = mix(vec4(envColour, fresnel*shoreFactor), (waveIntensity.x*wnNormal.wwww)+waveIntensity.y, waveFactor)+specularColour*shoreFactor;\ngl_FragColor = vec4(mix(surfaceColour.rgb, gl_Fog.color.rgb, gl_FogFragCoord), surfaceColour.a);\n}\n", -21129);
         var2[1] = vga.a((Object[])((Object[])var2[0]), false, new Object[][]{var4, var5});
         ((boolean[])((boolean[])var2[5]))[1] = var2[1] != null;
      }

      return var2;
   }

   static final void a(byte var0, int var1, Object[] var2) {
      ++a;
      if(var0 > -100) {
         a(((byte[])((byte[])var2[12]))[0], 43, (Object[])((Object[])d[0]));
      }

      if(null != var2 && var2.length == 3) {
         OpenGL.glFramebufferTexture2DEXT('\u8d40', var1, ((int[])((int[])var2[1]))[0], ((int[])((int[])((Object[])((Object[])var2[2]))[1]))[1], ((int[])((int[])var2[1]))[1]);
      } else if(null != var2 && 4 == var2.length) {
         OpenGL.glFramebufferTexture2DEXT('\u8d40', var1, ((int[])((int[])((Object[])((Object[])var2[2]))[1]))[2], ((int[])((int[])((Object[])((Object[])var2[2]))[1]))[1], ((int[])((int[])var2[1]))[0]);
      } else if(var2 != null && var2.length == 5) {
         wqa.a(var2, (int)-61, var1);
      } else {
         throw new IllegalStateException();
      }
   }

}
