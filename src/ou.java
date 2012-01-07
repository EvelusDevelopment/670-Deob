
final class ou {

   static int b;
   static Object[] d = mr.a(0, 0, new Object[1]);
   static int c;
   static int a;
   static int e;


   static final void a(int var0, Object[] var1, int var2) throws Exception {
      ++b;
      if(null != var1 && -11 == ~var1.length) {
         nea.a((int)-94, var1, var2);
      } else {
         wqa.a(var1, (byte)-80, var2);
         if(var0 != 6) {
            d = (Object[])null;
         }

      }
   }

   static final int a(Object[] var0, int var1) {
      ++c;
      if(var1 > -126) {
         d = (Object[])null;
      }

      int var2 = ((int[])((int[])var0[0]))[0];
      if(var2 == 2) {
         return 4;
      } else if(var2 != 3) {
         if(1 == var2) {
            return 2;
         } else if(var2 != 4) {
            if(var2 == 0) {
               return 7;
            } else {
               throw new IllegalArgumentException();
            }
         } else {
            return 10;
         }
      } else {
         return 26;
      }
   }

   static final boolean a(Object[] var0, Object[] var1, int var2) {
      if(var2 != -11) {
         a(124, (Object[])null, (Object[])null);
      }

      ++a;
      if(var1[7] != null) {
         label213: {
            if(!oj.a(true, var0)) {
               if(null == var0) {
                  throw new IllegalStateException();
               }

               boolean var5;
               if(((boolean[])((boolean[])((Object[])((Object[])var0[1]))[17]))[0] && ((boolean[])((boolean[])((Object[])((Object[])var0[1]))[17]))[3] && ((boolean[])((boolean[])((Object[])((Object[])var0[1]))[17]))[18]) {
                  var0[3] = el.a(true, (Object[])((Object[])var0[1]), new Object[5]);
                  if(null != var1 && var1.length == 14) {
                     return true;
                  }

                  var0[9] = kaa.a(3553, 256, ah.f, new Object[6], 256, vk.f_i, (Object[])((Object[])var0[1]), 2);
                  pda.a(false, false, (Object[])((Object[])var0[9]), false);
                  var0[10] = kaa.a(3553, 256, ah.f, new Object[6], 256, vk.f_i, (Object[])((Object[])var0[1]), 2);
                  pda.a(false, false, (Object[])((Object[])var0[10]), false);
                  Object[] var6;
                  Object[] var7;
                  ((ta)(null != (var6 = (Object[])((Object[])var0[1]))?var6[55]:null)).a((hsa)((var7 = (Object[])((Object[])var0[3])) == null?null:var7[3]), var2 + 70);
                  nn.a(false, 0, (Object[])((Object[])var0[3]), rs.a(0, 11024, (Object[])((Object[])var0[9])));
                  nn.a(false, 1, (Object[])((Object[])var0[3]), rs.a(0, var2 + 11035, (Object[])((Object[])var0[10])));
                  Class_ds.a(false, 0, (Object[])((Object[])var0[3]));
                  if(!nd.a((Object[])((Object[])var0[3]), (int)-115)) {
                     Object[] var8;
                     Object[] var9;
                     ((ta)(null == (var8 = (Object[])((Object[])var0[1]))?null:var8[55])).a(true, (hsa)((var9 = (Object[])((Object[])var0[3])) == null?null:var9[3]));
                     var5 = false;
                  } else {
                     Object[] var10;
                     Object[] var11;
                     ((ta)((var10 = (Object[])((Object[])var0[1])) == null?null:var10[55])).a(true, (hsa)((var11 = (Object[])((Object[])var0[3])) != null?var11[3]:null));
                     var0[11] = vga.a((Object[])((Object[])var0[1]), false, new Object[][]{rna.a((Object[])((Object[])var0[1]), '\u8b30', "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n", -21129)});
                     var0[5] = vga.a((Object[])((Object[])var0[1]), false, new Object[][]{rna.a((Object[])((Object[])var0[1]), '\u8b30', "uniform vec3 params;\nuniform sampler2D sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2D(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n", -21129)});
                     var0[6] = vga.a((Object[])((Object[])var0[1]), false, new Object[][]{rna.a((Object[])((Object[])var0[1]), '\u8b30', "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform vec3 dimScale;\nuniform sampler2D bloomTex;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n\t vec4 bloomCol = texture2D(bloomTex, gl_TexCoord[1].xy);\n\t vec4 sceneCol = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n\t float preLum = 0.99*dot(lumCoef, sceneCol.rgb)+0.01;\n    float postLum = preLum*(1.0+(preLum/params.y))/(preLum+1.0);\n\t gl_FragColor = sceneCol*(postLum/preLum)+bloomCol*params.x;\n}\n", -21129)});
                     var0[12] = vga.a((Object[])((Object[])var0[1]), false, new Object[][]{rna.a((Object[])((Object[])var0[1]), '\u8b30', "uniform vec3 step;\nuniform sampler2D baseTex;\nvoid main() {\n\tvec4 fragCol = texture2D(baseTex, gl_TexCoord[0].xy)*0.091396265;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-8.0*step.xy))*0.012369139;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 8.0*step.xy))*0.012369139;\n\tgl_FragColor = fragCol;\n}\n", -21129)});
                     var5 = null != var0[5] && var0[11] != null && var0[6] != null && var0[12] != null;
                  }
               } else {
                  var5 = false;
               }

               if(!var5) {
                  break label213;
               }
            }

            client.a(-81, (Object[])((Object[])var1[3]), (lm)(null == var0?null:var0[0]));
            cg.c(var1, (byte)127);
            if(dna.a((int)0, var1)) {
               if(0 != ~((int[])((int[])var1[1]))[1] && 0 != ~((int[])((int[])var1[1]))[4]) {
                  int var4 = ((int[])((int[])var1[1]))[1];
                  int var14 = ((int[])((int[])var1[1]))[4];
                  if(null == var0) {
                     throw new IllegalStateException();
                  }

                  ((int[])((int[])var0[4]))[0] = var14;
                  ((int[])((int[])var0[4]))[1] = var4;
                  int var13 = uma.a(-32125, ((int[])((int[])var0[4]))[1]);
                  int var15 = uma.a(-32125, ((int[])((int[])var0[4]))[0]);
                  if(((int[])((int[])var0[4]))[2] != var13 || ((int[])((int[])var0[4]))[3] != var15) {
                     int var16;
                     if(var0[7] != null) {
                        for(var16 = 0; ~var16 > ~((Object[])((Object[])var0[7])).length; ++var16) {
                           kla.a((byte)-58, ((Object[][])((Object[][])var0[7]))[var16]);
                        }

                        if(var1 != null && (var1.length == 1 && var1[0].equals(Integer.valueOf(0)) || -5 == ~var1.length && var1[3].equals(Integer.valueOf(2)) && var1[3].equals(Integer.valueOf(0)) || -4 == ~var1.length)) {
                           ji.a((byte)64, (Object[])null);
                        }

                        var0[7] = null;
                     }

                     if(var13 <= 256 && 256 >= var15) {
                        var0[8] = null;
                     } else {
                        var16 = var13;
                        int var17 = var15;
                        int var18 = 0;

                        while(256 < var16 || var17 > 256) {
                           ++var18;
                           if(256 < var16) {
                              var16 >>= 1;
                           }

                           if(var17 > 256) {
                              var17 >>= 1;
                           }
                        }

                        if(null == var0[8]) {
                           var0[8] = el.a(true, (Object[])((Object[])var0[1]), new Object[5]);
                        }

                        var16 = var13;
                        var17 = var15;
                        var0[7] = new Object[var18][];
                        var18 = 0;
                        if(var1 != null && 10 == var1.length && var1[2].equals(Boolean.valueOf(false))) {
                           dna.a((int)0, (Object[])null);
                        }

                        while(256 < var16 || 256 < var17) {
                           ((Object[][])((Object[][])var0[7]))[var18++] = kaa.a(3553, var16, ah.f, new Object[6], var17, vk.f_i, (Object[])((Object[])var0[1]), var2 ^ -9);
                           if(var17 > 256) {
                              var17 >>= 1;
                           }

                           if(256 < var16) {
                              var16 >>= 1;
                           }
                        }
                     }

                     ((int[])((int[])var0[4]))[3] = var15;
                     ((int[])((int[])var0[4]))[2] = var13;
                  }
               }

               ((boolean[])((boolean[])var0[2]))[0] = true;
               return true;
            }
         }

         ko.a(var0, var1, 10080);
      }

      return false;
   }

   static final Object[] a(int var0, Object[] var1, Object[] var2) {
      var1[0] = var2;
      if(var0 > -63) {
         return (Object[])null;
      } else {
         ++e;
         return var1;
      }
   }

}
