import jaclib.memory.Stream;
import jagdx.D3DADAPTER_IDENTIFIER;
import jagdx.IDirect3D;
import jagdx.IDirect3DDevice;
import jaggl.OpenGL;
import java.awt.Canvas;

final class sja {

   static int j;
   static int f_i;
   static int c;
   static int g;
   static Object[] h = ho.a(16, 67, new Object[1], true);
   static int d;
   static int a;
   static int b;
   static Object[] e = Class_fs.a(1, (byte)-74, new Object[1], 0, 15, 0);
   static int f = 0;


   static final synchronized void a(byte[] var0, boolean var1) {
      ++b;
      if(-101 == ~var0.length && wl.baS100cacheOffset < 1000) {
         vv.baS100cache[wl.baS100cacheOffset++] = var0;
      } else if(var0.length == 5000 && 250 > as.baS5000cacheOffset) {
         dq.baS5000cache[as.baS5000cacheOffset++] = var0;
      } else {
         if(!var1) {
            h = (Object[])((Object[])h[4]);
         }

         if(30000 == var0.length && moa.c < 50) {
            gha.a[moa.c++] = var0;
         } else {
            if(null != uqa.a) {
               for(int var2 = 0; vh.f.length > var2; ++var2) {
                  if(var0.length == vh.f[var2] && ~uqa.a[var2].length < ~im.h[var2]) {
                     uqa.a[var2][im.h[var2]++] = var0;
                     return;
                  }
               }
            }

         }
      }
   }

   static final boolean a(Object[] var0, int var1) {
      if(var1 > -99) {
         f = 62;
      }

      ++f_i;
      if(!((boolean[])((boolean[])((Object[])((Object[])var0[4]))[17]))[0]) {
         return false;
      } else {
         int var2 = qka.a(-23864, var0);
         moa.a((byte)120, var0, (Object[])((Object[])var0[4]));
         OpenGL.glGenerateMipmapEXT(((int[])((int[])var0[1]))[2]);
         ((boolean[])((boolean[])var0[3]))[0] = true;
         Class_b.a(var0, 22775);
         uia.a(var2, var0, -121);
         return true;
      }
   }

   static final synchronized byte[] createByteArray(int size) {
      ++c;
      byte[] var4;
      if(size == 100 && 0 < wl.baS100cacheOffset) {
         var4 = vv.baS100cache[--wl.baS100cacheOffset];
         vv.baS100cache[wl.baS100cacheOffset] = null;
         return var4;
      } else if(size == 5000 && as.baS5000cacheOffset > 0) {
         var4 = dq.baS5000cache[--as.baS5000cacheOffset];
         dq.baS5000cache[as.baS5000cacheOffset] = null;
         return var4;
      } else {
         if(30000 == size && 0 < moa.c) {
            var4 = gha.a[--moa.c];
            gha.a[moa.c] = null;
            return var4;
         } else {
            if(null != uqa.a) {
               for(int var2 = 0; var2 < vh.f.length; ++var2) {
                  if(vh.f[var2] == size && im.h[var2] > 0) {
                     byte[] var3 = uqa.a[var2][--im.h[var2]];
                     uqa.a[var2][im.h[var2]] = null;
                     return var3;
                  }
               }
            }
            return new byte[size];
         }
      }
   }

   static final Object[] a(boolean var0, Object[] var1) {
      ++d;
      D3DADAPTER_IDENTIFIER var2 = new D3DADAPTER_IDENTIFIER();
      IDirect3D.GetAdapterIdentifier(((long[])((long[])var1[50]))[6], ((int[])((int[])var1[1]))[41], 0, var2);
      return !var0?(Object[])null:dda.a(9, var2.DriverVersion, new Object[4], 36, var2.Description, "Direct3D", var2.VendorID);
   }

   static final void a(int var0, Object[] var1) {
      ++g;
      if(null != var1 && 87 == var1.length) {
         IDirect3DDevice.a(((long[])((long[])var1[50]))[5], 7, ((boolean[])((boolean[])var1[63]))[12]);
      } else if(null != var1 && 91 == var1.length) {
         if(((boolean[])((boolean[])var1[63]))[12]) {
            OpenGL.glEnable(2929);
         } else {
            OpenGL.glDisable(2929);
         }

      } else {
         if(var0 >= -40) {
            ((int[])((int[])e[9]))[2] = -117;
         }

         throw new IllegalStateException();
      }
   }

   static final boolean a(int var0, int var1, int var2, Object[] var3) {
      ++j;
      int var4 = (var2 + -var1) * ((int[])((int[])var3[1]))[7] >> 12;
      if(var0 > -34) {
         a((Object[])null, ((int[])((int[])((Object[])((Object[])var3[0]))[1]))[2]);
      }

      int var5 = usa.c[(var4 * 255 & 1047577) >> 12];
      var5 = (var5 << 12) / ((int[])((int[])var3[1]))[7];
      var5 = (var5 << 12) / ((int[])((int[])var3[1]))[1];
      var5 = ((int[])((int[])var3[1]))[6] * var5 >> 12;
      return ~var5 < ~(var1 + var2) && -var5 < var1 + var2;
   }

   static final ta a(int var0, int var1, Object[] var2, qa var3, Canvas var4) {
      try {
         ++a;

         try {
            boolean var6 = eoa.a(true);
            if(!var6) {
               throw new RuntimeException("");
            } else if(hp.a((byte)-124, "jaggl")) {
               rca.a(114, var4);
               OpenGL var7 = new OpenGL();
               long var8 = var7.init(var4, 8, 8, 8, 24, 0, var0);
               int var10 = -2 / ((var1 - 3) / 57);
               if(null != var2 && var2.length == 7) {
                  a(-46, 124, (Object[])null, (qa)null, (Canvas)null);
               }

               if(0L == var8) {
                  throw new RuntimeException("");
               } else {
                  Object[] var12 = new Object[91];
                  cla.a(var12, (byte)-110);
                  ssa.a(var2, 1, var3, var0, var12, true);
                  bb.b(-61, var12);
                  int[] var14 = new int[1];

                  try {
                     if(null != var2 && var2.length == 15) {
                        return null;
                     }

                     label211: {
                        var12[86] = var7;
                        ((OpenGL)var12[86]).b();
                        var12[85] = OpenGL.glGetString(7936).toLowerCase();
                        var12[90] = OpenGL.glGetString(7937).toLowerCase();
                        if(~((String)var12[85]).indexOf("microsoft") == 0 && -1 == ((String)var12[85]).indexOf("brian paul") && ((String)var12[85]).indexOf("mesa") == -1) {
                           String var15 = OpenGL.glGetString(7938);
                           String[] var16 = ul.a(0, var15.replace('.', ' '), ' ');
                           if(-3 >= ~var16.length) {
                              try {
                                 int var17 = bca.a((byte)-128, var16[0]);
                                 int var18 = bca.a((byte)70, var16[1]);
                                 ((int[])((int[])var12[1]))[39] = var18 + var17 * 10;
                              } catch (NumberFormatException var28) {
                                 throw new RuntimeException("");
                              }

                              if(((int[])((int[])var12[1]))[39] >= 12) {
                                 OpenGL.glGetIntegerv('\u84e2', var14, 0);
                                 ((int[])((int[])var12[1]))[8] = var14[0];
                                 if(2 > ((int[])((int[])var12[1]))[8]) {
                                    throw new RuntimeException("");
                                 }

                                 label231: {
                                    ((int[])((int[])var12[1]))[12] = 8;
                                    ((boolean[])((boolean[])var12[63]))[24] = ((OpenGL)var12[86]).a("GL_ARB_vertex_buffer_object");
                                    ((boolean[])((boolean[])var12[63]))[7] = ((OpenGL)var12[86]).a("GL_ARB_multisample");
                                    ((boolean[])((boolean[])var12[63]))[27] = ((OpenGL)var12[86]).a("GL_ARB_texture_rectangle");
                                    ((OpenGL)var12[86]).a("GL_ARB_texture_cube_map");
                                    ((boolean[])((boolean[])var12[63]))[23] = ((OpenGL)var12[86]).a("GL_ARB_texture_non_power_of_two");
                                    ((boolean[])((boolean[])var12[63]))[17] = ((OpenGL)var12[86]).a("GL_EXT_texture3D");
                                    ((boolean[])((boolean[])var12[63]))[26] = ((OpenGL)var12[86]).a("GL_ARB_vertex_shader");
                                    ((OpenGL)var12[86]).a("GL_ARB_vertex_program");
                                    ((boolean[])((boolean[])var12[63]))[21] = ((OpenGL)var12[86]).a("GL_ARB_fragment_shader");
                                    ((OpenGL)var12[86]).a("GL_ARB_fragment_program");
                                    ((OpenGL)var12[86]).a("GL_EXT_framebuffer_object");
                                    var12[75] = new int[((int[])((int[])var12[1]))[8]];
                                    ((boolean[])((boolean[])var12[63]))[19] = ((OpenGL)var12[86]).a("GL_EXT_framebuffer_object");
                                    ((OpenGL)var12[86]).a("GL_EXT_framebuffer_blit");
                                    ((OpenGL)var12[86]).a("GL_EXT_framebuffer_multisample");
                                    boolean var34 = ((boolean[])((boolean[])var12[63]))[26];
                                    if(var34) {
                                       boolean var36 = ((boolean[])((boolean[])var12[63]))[21];
                                       if(var36) {
                                          break label231;
                                       }
                                    }

                                    if(!((OpenGL)var12[86]).a("GL_ARB_multitexture")) {
                                       throw new RuntimeException("");
                                    }

                                    if(!((OpenGL)var12[86]).a("GL_ARB_texture_env_combine")) {
                                       throw new RuntimeException("");
                                    }
                                 }

                                 int[] var35 = (int[])((int[])var12[1]);
                                 boolean var19 = Stream.b;
                                 var35[40] = !var19?5121:'\u8367';
                                 if(-1 != ((String)var12[90]).indexOf("radeon")) {
                                    if(var2 != null && var2.length == 8) {
                                       return null;
                                    }

                                    int var20 = 0;
                                    boolean var21 = false;
                                    boolean var22 = false;
                                    String[] var23 = ul.a(0, ((String)var12[90]).replace('/', ' '), ' ');

                                    for(int var24 = 0; var23.length > var24; ++var24) {
                                       String var25 = var23[var24];

                                       try {
                                          if(var25.length() > 0) {
                                             if(-121 == ~var25.charAt(0) && 3 <= var25.length() && ft.a((byte)-97, var25.substring(1, 3))) {
                                                var25 = var25.substring(1);
                                                var22 = true;
                                             }

                                             if(!var25.equals("hd")) {
                                                if(var25.startsWith("hd")) {
                                                   var21 = true;
                                                   var25 = var25.substring(2);
                                                }

                                                if(-5 >= ~var25.length() && ft.a((byte)-123, var25.substring(0, 4))) {
                                                   var20 = bca.a((byte)-126, var25.substring(0, 4));
                                                   break;
                                                }
                                             } else {
                                                var21 = true;
                                             }
                                          }
                                       } catch (Exception var29) {
                                          ;
                                       }
                                    }

                                    if(!var22 && !var21) {
                                       if(var20 >= 7000 && var20 <= 9250) {
                                          ((boolean[])((boolean[])var12[63]))[17] = false;
                                       }

                                       if(var20 >= 7000 && 7999 >= var20) {
                                          ((boolean[])((boolean[])var12[63]))[24] = false;
                                       }
                                    }

                                    ((boolean[])((boolean[])var12[63]))[27] &= ((OpenGL)var12[86]).a("GL_ARB_half_float_pixel");
                                 }

                                 if(0 == ~((String)var12[85]).indexOf("intel")) {
                                    ;
                                 }

                                 if(((boolean[])((boolean[])var12[63]))[24]) {
                                    try {
                                       int[] var37 = new int[1];
                                       OpenGL.glGenBuffersARB(1, var37, 0);
                                    } catch (Throwable var27) {
                                       throw new RuntimeException("");
                                    }
                                 }
                                 break label211;
                              }

                              throw new RuntimeException("");
                           }

                           throw new RuntimeException("");
                        }

                        throw new RuntimeException("");
                     }

                     Object[] var13;
                     ((ta)var12[38]).a(var4, (gv)(null != (var13 = jra.a(var12, var8, (byte)-37, var4, new Object[6]))?var13[0]:null), 8);
                     ((ta)var12[38]).a(var4, -123);
                     ho.a('\u8000', false, 46, var12);
                     ho.a('\u8000', false, 46, var12);
                  } catch (Throwable var30) {
                     var30.printStackTrace();
                     ((ta)var12[38]).a((byte)17);
                     if(!(var30 instanceof OutOfMemoryError)) {
                        throw new RuntimeException("");
                     }

                     throw (OutOfMemoryError)var30;
                  }

                  aqa.a(var12, false);
                  return (ta)(var12 == null?null:var12[38]);
               }
            } else {
               throw new RuntimeException("");
            }
         } catch (RuntimeException var31) {
            throw var31;
         } catch (Throwable var32) {
            throw new RuntimeException("");
         }
      } catch (RuntimeException var33) {
         throw vt.a(var33, "sja.D(" + var0 + ',' + var1 + ',' + (var2 != null?"{...}":"null") + ',' + (var3 != null?"{...}":"null") + ',' + (var4 != null?"{...}":"null") + ')');
      }
   }

}
